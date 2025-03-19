class employee{
  public double calculateBonus(int basesalary){
    return basesalary*0.05;
  }
  double calculateBonus(double basesalary,int perfomanceRating){
    double bonusPercentage;
     switch(perfomanceRating){
        case 5:bonusPercentage=0.20;break;
        case 4:bonusPercentage=0.15;break;
        case 3:bonusPercentage=0.10;break;
        case 2:bonusPercentage=0.05;break;
        case 1:bonusPercentage=0.00;break;
        default:
        System.out.println("Invalid Option.Bonus set to 0.");
        return 0.0;
     }
     return basesalary*bonusPercentage;

  }
    }

public class EmployeeBonusCalculation {
    public static void main(String[] args){
        employee e1=new employee();
        int basesalary1=5000;
        System.out.println("Bonus (5% fixed): $"+e1.calculateBonus(basesalary1));

        double basesalary2=6888;
        int perfomanceRating=4;
        System.out.println("Bonus based on rating "+perfomanceRating+" :$"+e1.calculateBonus(basesalary2, perfomanceRating));

    }
    
}
