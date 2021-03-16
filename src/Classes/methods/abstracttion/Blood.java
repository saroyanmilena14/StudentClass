package Classes.methods.abstracttion;

  public class Blood extends Liquid {

      String bloodType;
      String bloodCells;

      public Blood (double tempOfBoiling, String bloodType, String bloodCells) {
          super(tempOfBoiling);
          this.bloodType=bloodType;
          this.bloodCells=bloodCells;
      }


      @Override
      public void TempOfBoiling() {
          super.TempOfBoiling();
          System.out.println("The boiling temperature of blood is"+ " " + tempOfBoiling );
      }
      @Override
       public void GetAllFeatures() {
          super.GetAllFeatures();
          System.out.println("bloodType:"+ " "+ bloodType);
          System.out.println("bloodCells:"+ " "+ bloodCells);
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


  }
