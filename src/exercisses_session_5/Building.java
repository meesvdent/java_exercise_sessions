package exercisses_session_5;

public class Building {

    private int availableSpace;
    private String address;

    public Building(int availableSpace, String address){
        this.setAvailableSpace(availableSpace);
        this.setAddress(address);
    }

    public Building(int availableSpace){
        this.setAvailableSpace(availableSpace);
        this.setAddress("Unknown");
    }

    public String toString(){
        return "This is a building with " + this.availableSpace + " meters of office space located at " + this.address + ".";
    }

    public int getAvailableSpace(){
        return this.availableSpace;
    }

    public void setAvailableSpace(int availableSpace) throws IllegalArgumentException{
        if(availableSpace > 0){
            this.availableSpace = availableSpace;
        }
        else{
            throw new IllegalArgumentException("Available space should be larger than zero.");
        }
    }

    public String getAddress(){
        return this.address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public static void main(String[] args) {
        Building buildingOne = new Building(82, "Naamsestraat 69, 3000 Leuven");
        Building buildingTwo = new Building(60);

        System.out.println(buildingOne);
        System.out.println(buildingTwo);
    }

}
