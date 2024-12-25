package PrototypePattern;
    public class Book implements Cloneable {
        private String title;
        public void setTitle(String title) {
            this.title = title;
        }
        public String getTitle() {
            return title;
        }
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
