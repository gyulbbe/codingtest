import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Song> songs = new ArrayList<>();
        ArrayList<Song> results = new ArrayList<>();
        
        // 1. 장르별로 총 플레이 수 저장
        HashMap<String, Integer> map = new HashMap<>(); 
        int len = genres.length;
        for (int i = 0; i < len; i++) {
            Song song = new Song(genres[i], plays[i], i);
            songs.add(song);
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // 2. 장르별로 총 플레이수 정렬
        ArrayList<Song> playlist = new ArrayList<>(); 
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Song song = new Song(entry.getKey(), entry.getValue());
            playlist.add(song);
        }
        Collections.sort(playlist, (a, b) -> b.play - a.play);
        Collections.sort(songs, (a, b) -> b.play - a.play);
        
        // 3. results에 담기
        HashMap<String, Integer> countMap = new HashMap<>();
        for (Song play : playlist) {
            for (Song song : songs) {
                if (play.genre.equals(song.genre)) {
                    if (countMap.getOrDefault(song.genre, 0) == 2) {
                        break;
                    }
                    countMap.put(song.genre, countMap.getOrDefault(song.genre, 0) + 1);
                    results.add(song);
                }
            }
        }
        
        // 4. 배열로 전환
        int[] resultArray = new int[results.size()];
        for (int i = 0; i < results.size(); i++) {
           resultArray[i] = results.get(i).index;
        }
        
        return resultArray;
    }
    
    class Song {
        String genre;
        int play;
        int index;
        
        public Song () {}
        public Song (String genre, int play) {
            this.genre = genre;
            this.play = play;
        }
        
        public Song (String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }
}