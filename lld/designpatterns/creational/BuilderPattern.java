public class BuilderPattern {
    // TODO: Implement Builder Pattern

    // Pseudo code:
    // - class Computer { private String CPU, RAM, etc.; private constructor; getters; }
    // - static class ComputerBuilder { private fields; methods setCPU(String), setRAM(String), build() { return new Computer(this); } }

    static class Computer {
        private String CPU;
        private String RAM;
        private String storage;

        private Computer(ComputerBuilder builder) {
            this.CPU = builder.CPU;
            this.RAM = builder.RAM;
            this.storage = builder.storage;
        }

        // getters

        static class ComputerBuilder {
            private String CPU;
            private String RAM;
            private String storage;

            public ComputerBuilder setCPU(String CPU) { this.CPU = CPU; return this; }
            public ComputerBuilder setRAM(String RAM) { this.RAM = RAM; return this; }
            public ComputerBuilder setStorage(String storage) { this.storage = storage; return this; }
            public Computer build() { return new Computer(this); }
        }
    }

    // TODO: Complete
}