public class Collection {
    private Integer[] array;

    public Collection(Integer[] array) {
        this.array = array;
    }


    public class Forward implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return count < array.length;
        }

        @Override
        public Integer next() {
            if (array[count] % 2 != 0) {
                array[count] = 0;
            }
            return array[count++];
        }
    }

    public Forward createForward() {
        return new Forward();
    }

    public class Backword implements Iterator {

        int count = array.length - 1;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Integer next() {
            count -=1;
            return array[count --];
        }
    }

    public Backword createBackword() {
        return new Backword();
    }


    public class Anonymous implements Iterator {

        int count = array.length - 1;

        @Override
        public boolean hasNext() {
            return count > 1;
        }

        @Override
        public Integer next() {
            return array[count -= 3];
        }

    }
    public Anonymous createAnonymous() {
        return new Anonymous();
    }

    public Iterator createdClass(){
        class  NumberCount implements Iterator {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < array.length-5;
            }

            @Override
            public Integer next() {
                return array[count+=5];
            }
        }
        return new NumberCount();
    }

}

