//* 2019 FRQ2 */

public class StepTracker
{
   private int activeDays;
   private int numDays;
   private int minActive;
   private int totalSteps;


   public StepTracker(int tr){
       totalSteps = 0;
       minActive = tr;
       activeDays = 0;
       numDays = 0;
   }

    public int activeDays(){
        return activeDays;
    }


    public void addDailySteps(int step){
        totalSteps += step;
        numDays++;
        if (step >= minActive){
            activeDays++;
        }
    }

    public double averageSteps(){
        if (numDays==0){
            return 0;}
        return (double) totalSteps/numDays;
    }
    public static void main(String[] args)
    {
        StepTracker tr = new StepTracker(10000);
        // returns 0. No data has been recorded yet.
        System.out.println(tr.activeDays());
        // returns 0.0. When no step data have been recorded,
        //  the averageSteps method returns 0.0
        System.out.println(tr.averageSteps());

        // This is too few steps for the day to be considered active.
        tr.addDailySteps(9000);

        // This is too few steps for the day to be considered active.
        tr.addDailySteps(5000);

        // returns 0.  No day had at least 10,000 steps.
        System.out.println(tr.activeDays());
        // returns 7000.0 The average number of steps per day is (14000/2).
        System.out.println(tr.averageSteps());

        // This represents an active day.
        tr.addDailySteps(13000);
        // returns 1. Of the three days for which step data were entered,
        // one day had at least 10,000 steps.
        System.out.println(tr.activeDays());
        // returns 9000.0. The average number of steps per day is (27000/3).
        System.out.println(tr.averageSteps());

        tr.addDailySteps(23000); // This represents an active day.
        tr.addDailySteps(1111); // This is too few steps for the day to be active.
        // returns 2. Of the five days for which step data were entered,
        //    two days had at least 10,000 steps.
        System.out.println(tr.activeDays());
        // returns 10222.2. The average number of steps per day is (51111/5).
        System.out.println(tr.averageSteps());
    }
}

