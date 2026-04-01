public class CompositePattern {
    // TODO: Implement Composite Pattern

    // Pseudo code:
    // - interface Employee { void showDetails(); }
    // - class Developer implements Employee
    // - class Manager implements Employee { private List<Employee> subordinates; showDetails() { for each sub.showDetails() } }

    interface Employee {
        void showDetails();
    }

    static class Developer implements Employee {
        private String name;
        private String position;

        public Developer(String name, String position) {
            this.name = name;
            this.position = position;
        }

        public void showDetails() {
            System.out.println(name + " : " + position);
        }
    }

    static class Manager implements Employee {
        private String name;
        private String position;
        private List<Employee> subordinates;

        public Manager(String name, String position) {
            this.name = name;
            this.position = position;
            subordinates = new ArrayList<>();
        }

        public void addEmployee(Employee emp) {
            subordinates.add(emp);
        }

        public void removeEmployee(Employee emp) {
            subordinates.remove(emp);
        }

        public void showDetails() {
            System.out.println(name + " : " + position);
            for (Employee emp : subordinates) {
                emp.showDetails();
            }
        }
    }

    // TODO: Complete
}