public final class Condition {

    public static class Value {
        private String s;
        private Float f;
        
        public Value(String s) {
            this.s = s;
        }

        public Value(Float f) {
            this.f = f;
        }

        public boolean isString() {
            return this.s != null;
        }

        public boolean isNumeric() {
            return this.f != null;
        }

        public void checkNumeric() {
            if (!isNumeric()) {
                throw new RuntimeException("OTHER ERROR");
            }
        }

        public String getString() {
            return s;
        }

        public Float getFloat() {
            return f;
        }
    }

    private Condition() {};
}