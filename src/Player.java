public class Player extends Human {
    Backpack backpack = new Backpack();

    public Player(String name) {
        super(name);
    }

    public void take(String thing) {
        int i = 0;
        int index = 0;
        while (i < backpack.things.length) {
            if (backpack.things[i] == null) {
                index = i;
                break;
            }
            i++;
        }
        backpack.things[index] = thing;
    }

    class Backpack {
        String[] things;

        public Backpack () {
            things = new String[10];
        }
        @Override
        public String toString() {
            if (things[0] == null) {
                return "the backpack is empty";
            }
            int i = 0;
            StringBuilder str = new StringBuilder();
            while (things[i] != null) {
                str.append(things[i]);
                i++;
                if (things[i] == null) {
                    continue;
                }
                str.append(",");
            }
            str.append(" in the backpack");
            return str.toString();
        }



    }



}
