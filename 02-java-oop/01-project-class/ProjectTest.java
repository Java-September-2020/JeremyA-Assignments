public class ProjectTest {
    public static void main (String [] args) {

        Project building = new Project();
        building.setName("Tower");
        building.setDescription("Babylonian Tower");
        String buildingName = building.getName();
        String buildingDesc = building.getDescription();

        System.out.println ("Project's name: " + buildingName + 
        " Project's description: " + buildingDesc);

        Project p = new Project("Riding high! ");
        p.setName("Rocket");
        p.setDescription("Power");
        System.out.println("Name: " + p.getName());
        System.out.println("Description: " + p. getDescription());
    }
}