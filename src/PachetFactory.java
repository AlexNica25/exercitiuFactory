
public class PachetFactory {
    public PachetTuristic getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("PachetCazare")){
            return new PachetCazare();

        } else if(shapeType.equalsIgnoreCase("PachetTransport")){
            return new PachetTransport();

        } else if(shapeType.equalsIgnoreCase("PachetComplet")){
            return new PachetComplet();
        }

        return null;
    }
}
