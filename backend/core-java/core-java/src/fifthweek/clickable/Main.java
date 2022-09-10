package fifthweek.clickable;


    public class Main {


        public static void main(String[] args) {

            // Create a new window
            InterfaceFrame frame = new InterfaceFrame();

            // Add the types of objects that we want to create
            frame.addShape(new ClickableTriangle());

            // Make the window appear
            frame.setVisible(true);

        }

    }

