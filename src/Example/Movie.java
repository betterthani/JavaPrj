package Example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
	private String name; //제목
	private String genre;// 장르
	private String director;// 감독
	private String MainActor;// 주연
	private String openDate;// 개봉일
}
