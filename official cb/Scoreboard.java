//** 2024 FRQ 2 */
    public class Scoreboard {

        private String team1;
        private String team2;
        private int team1_score;
        private int team2_score;
        private int active;

        public  Scoreboard(String t1, String t2){
            team1 = t1;
            team2 = t2;
            team1_score = 0;
            team2_score = 0;
            active = 1;
        }

        public void recordPlay(int point) {
            if (point == 0){
                if (active == 1){
                    active = 2;
                }else{
                    active = 1;
            }}
            else{
                if (active == 1){
                    team1_score += point;
                }else{
                    team2_score += point;
                }
            }
        }

        public String getScore(){
            if (active == 1){
                return team1_score + "-" + team2_score + "-" + team1;
            }else{
                return team1_score + "-" + team2_score + "-" + team2;
            }
        }

    }
