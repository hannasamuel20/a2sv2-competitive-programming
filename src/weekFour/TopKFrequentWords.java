package weekFour;

import java.util.*;

public class TopKFrequentWords {


    class Freq{
        int frequency;
        String word;
        public Freq(int frequency,String word){
            this.frequency=frequency;
            this.word=word;
        }
    }
    class FreqComparator implements Comparator<Freq> {
        public int compare(Freq s1, Freq s2) {
            if (s1.frequency < s2.frequency)
                return 1;
            else if (s1.frequency > s2.frequency)
                return -1;
            else{
                int length = Math.max(s1.word.length(), s2.word.length());
                int i = 0;
                while(i<length){
                    if(i>=s1.word.length()){
                        return -1;
                    }
                    else if(i>=s2.word.length()){
                        return 1;
                    }
                    if(s1.word.charAt(i) < s2.word.charAt(i)){
                        return -1;
                    }
                    else if(s1.word.charAt(i) > s2.word.charAt(i)){
                        return 1;
                    }
                    i++;
                }

            }
            return 0;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> frequentWords = new HashMap<>();
        PriorityQueue<Freq> heap = new PriorityQueue<>(new FreqComparator());
        ArrayList<String> array = new ArrayList<>();

        for(String word:words){
            if(frequentWords.containsKey(word)){
                int freq = frequentWords.get(word);
                frequentWords.replace(word,++freq);
            }
            else{
                frequentWords.put(word,1);
            }
        }

        for (Map.Entry e:frequentWords.entrySet()) {
            heap.add(new Freq((Integer) e.getValue(),(String)e.getKey()));
        }
        int i = 0;
        while(i<k){
            array.add(heap.remove().word);
            i++;
        }
        return array;

    }

}
