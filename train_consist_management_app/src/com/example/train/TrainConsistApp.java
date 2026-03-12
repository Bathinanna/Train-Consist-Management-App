package com.example.train;



public class TrainConsistApp {

    // Custom runtime exception (unchecked)
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String bogieId;
        private String shape; // Rectangular / Cylindrical
        private String cargo; // Assigned at runtime

        public GoodsBogie(String bogieId, String shape) {
            this.bogieId = bogieId;
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                System.out.println("\nAssigning cargo '" + cargo + "' to " + bogieId + " (" + shape + ")...");

                // Safety rule:
                // Petroleum must NOT be assigned to Rectangular bogie
                if ("Rectangular".equalsIgnoreCase(shape) && "Petroleum".equalsIgnoreCase(cargo)) {
                    throw new CargoSafetyException(
                        "Unsafe assignment! Petroleum cannot be assigned to Rectangular bogie " + bogieId
                    );
                }

                // Safe assignment
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully to " + bogieId + ".");
            } catch (CargoSafetyException e) {
                System.out.println("ERROR: " + e.getMessage());
            } finally {
                // Always executes (success or failure)
                System.out.println("Assignment attempt completed for " + bogieId + ".");
            }
        }

        @Override
        public String toString() {
            return "GoodsBogie{id='" + bogieId + "', shape='" + shape + "', cargo='" + cargo + "'}";
        }
    }

    public static void main(String[] args) {
        System.out.println("=======================================================");
        System.out.println("UC15 - Safe Cargo Assignment Using try-catch-finally");
        System.out.println("=======================================================");

        GoodsBogie bogie1 = new GoodsBogie("GB101", "Rectangular");
        GoodsBogie bogie2 = new GoodsBogie("GB102", "Cylindrical");

        // Unsafe assignment (handled safely)
        bogie1.assignCargo("Petroleum");

        // Safe assignments
        bogie1.assignCargo("Coal");
        bogie2.assignCargo("Petroleum");

        // Application continues safely
        System.out.println("\nFinal Bogie States:");
        System.out.println(bogie1);
        System.out.println(bogie2);

        System.out.println("\nUC15 runtime handling completed...");
    }
}