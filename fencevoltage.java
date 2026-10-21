import java.util.*;

public class fencevoltage {

    static class Wire {
        int x1, y1, x2, y2;

        Wire(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of wires
        int n = sc.nextInt();
        List<Wire> wires = new ArrayList<>();

        // Input the wires
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            wires.add(new Wire(x1, y1, x2, y2));
        }

        // Input the animal resistance thresholds
        Map<String, Integer> animalThresholds = new HashMap<>();
        sc.nextLine(); // Consume the newline
        String[] animalData = sc.nextLine().split(" ");
        for (String data : animalData) {
            String[] parts = data.split(":");
            animalThresholds.put(parts[0], Integer.parseInt(parts[1]));
        }

        // Input the animal that touched the fence
        String touchedAnimal = sc.nextLine();

        // Find all intersections
        Map<String, List<Wire>> intersections = new HashMap<>();
        for (int i = 0; i < wires.size(); i++) {
            for (int j = i + 1; j < wires.size(); j++) {
                String intersection = findIntersection(wires.get(i), wires.get(j));
                if (intersection != null) {
                    intersections.computeIfAbsent(intersection, k -> new ArrayList<>()).add(wires.get(i));
                    intersections.get(intersection).add(wires.get(j));
                }
            }
        }

        // Calculate total voltage
        int totalVoltage = 0;
        for (Map.Entry<String, List<Wire>> entry : intersections.entrySet()) {
            List<Wire> crossingWires = entry.getValue();
            int minCells = Integer.MAX_VALUE;

            for (Wire wire : crossingWires) {
                minCells = Math.min(minCells, calculateCells(wire, entry.getKey()));
            }

            totalVoltage += crossingWires.size() * minCells;
        }

        // Check if the touched animal dies
        int threshold = animalThresholds.get(touchedAnimal);
        System.out.println(totalVoltage > threshold ? "Yes" : "No");

        // Calculate probability of death for all animals
        int dyingAnimals = 0;
        for (int resistance : animalThresholds.values()) {
            if (totalVoltage > resistance) {
                dyingAnimals++;
            }
        }

        double probability = (double) dyingAnimals / animalThresholds.size();
        System.out.printf("%.2f%n", probability);
    }

    // Helper method to find intersection of two wires
    private static String findIntersection(Wire w1, Wire w2) {
        int x1 = w1.x1, y1 = w1.y1, x2 = w1.x2, y2 = w1.y2;
        int x3 = w2.x1, y3 = w2.y1, x4 = w2.x2, y4 = w2.y2;

        // Check if they are orthogonal and intersect
        if (x1 == x2 && y3 == y4 && x3 <= x1 && x1 <= x4 && y1 <= y3 && y3 <= y2) {
            return x1 + "," + y3;
        }
        if (y1 == y2 && x3 == x4 && y3 <= y1 && y1 <= y4 && x1 <= x3 && x3 <= x2) {
            return x3 + "," + y1;
        }
        return null;
    }

    // Helper method to calculate cells from the intersection
    private static int calculateCells(Wire wire, String intersection) {
        String[] parts = intersection.split(",");
        int ix = Integer.parseInt(parts[0]);
        int iy = Integer.parseInt(parts[1]);

        int cells = 0;
        if (wire.x1 == wire.x2) { // Vertical wire
            if (iy >= wire.y1 && iy <= wire.y2) {
                cells = Math.min(iy - wire.y1, wire.y2 - iy);
            }
        } else { // Horizontal wire
            if (ix >= wire.x1 && ix <= wire.x2) {
                cells = Math.min(ix - wire.x1, wire.x2 - ix);
            }
        }
        return cells;
    }
}
