package slavik.sendbox.random_not_repeted;

import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by vymi1016 on 12/23/2016.
 */
public class RandomForCelebrait {
    private List<String> friends = new ArrayList<>();
    private List<String> toFriends = new ArrayList<String>();;

    public static void main(String[] args) {
        RandomForCelebrait randomForCelebrait = new RandomForCelebrait();
        randomForCelebrait.readBuffer();
        randomForCelebrait.random();
    }

    public void random() {
        // перемешиваем
        Collections.shuffle(toFriends);
        for(int  g = 0; g<friends.size();g++){
            for (int  i = 0; i<toFriends.size();i++) {
                if(friends.get(g).equals(toFriends.get(i))) {continue;}
                else {
                    File file = new File(friends.get(g));
                    try (FileWriter buff = new FileWriter(file)) {
                        buff.write(toFriends.get(i));
                        toFriends.remove(toFriends.get(i));
                        break;
                    }  catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

       /* int t1 = fill.get(0);
        int t2 = fill.get(1);*/
    }
    public List<String> readBuffer(){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
           friends = new ArrayList<String>();

            String line = new String();
             while (true){
                 line = bufferedReader.readLine();
                 if (line.equals("all")) {
                     break;
                 }
                 friends.add( line);
                 toFriends.add(line);
             }
            return   friends;

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            return null;
        }
    }
}
