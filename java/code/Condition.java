public class Condition {

    public class Value {
        private String s;
        private Long l;
        
        public Value(String s) {
            this.s = s;
        }

        public Value(Long l) {
            this.l = l;
        }

        public boolean isString() {
            return this.s != null;
        }

        public void checkNumeric() {
            if (this.l != null) {
                throw new RuntimeException("OTHER ERROR");
            }
        }

        public String getString() {
            return s;
        }

        public Long getLong() {
            return l;
        }
    }

    private Condition() {};
}