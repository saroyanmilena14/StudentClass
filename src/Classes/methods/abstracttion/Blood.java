package Classes.methods.abstracttion;

  public class Blood extends Liquid {

     private String bloodType;
     private String bloodCells;
     private double mass;
     private double volume;

      public Blood (double tempOfBoiling, String bloodType, String bloodCells, double mass, double volume) {
          super(tempOfBoiling);
          this.bloodType=bloodType;
          this.bloodCells=bloodCells;
          this.mass=mass;
          this.volume=volume;
      }
      @Override
      public double Density (){
          return mass/volume;
      }


      @Override
       public void GetAllFeatures() {
          super.GetAllFeatures();
          System.out.println("bloodType:"+ " "+ bloodType);
          System.out.println("bloodCells:"+ " "+ bloodCells);
          System.out.println("mass:"+ " "+ mass);
          System.out.println("volume:"+ " "+ volume);
      }



      public String getBloodType() {
          return bloodType;
      }

      public void setBloodType(String bloodType) {
          this.bloodType = bloodType;
      }


      public String getBloodCells() {
          return bloodCells;
      }

      public void setBloodCells(String bloodCells) {
          this.bloodCells = bloodCells;
      }

      public double getMass() {
          return mass;
      }

      public void setMass(double mass) {
          this.mass = mass;
      }

      public double getVolume() {
          return volume;
      }

      public void setVolume(double volume) {
          this.volume = volume;
      }
  }
