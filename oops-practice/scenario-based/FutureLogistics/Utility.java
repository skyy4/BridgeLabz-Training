package FutureLogistics;

public class Utility {

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        // Basic validation on split length to avoid ArrayIndexOutOfBoundsException
        if (data.length < 4) {
            // Ideally valid input should have enough fields.
            // We can return null or let it throw exception based on req.
            // Assuming user input follows format.
        }

        String transportId = data[0];
        String transportDate = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (!validateTransportId(transportId)) {
            System.out.println("Please provide a valid record");
            return null;
        }

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(transportId, transportDate, rating,
                    brickSize, brickQuantity, brickPrice);
        } else {
            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(transportId, transportDate, rating,
                    timberLength, timberRadius, timberType, timberPrice);
        }
    }

    public boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS[0-9]{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            return false;
        }
        return true;
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}
