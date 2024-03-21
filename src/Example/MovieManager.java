package Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieManager {
	static Scanner scan = new Scanner(System.in);

	static List<Movie> movieList = new ArrayList<Movie>();

	// 영화정보 입력(i), 수정(u), 삭제(d), 장르로 영화찾기(f), 전체 목록 출력(l), 종료(q)

	public static void main(String[] args) {

		while (true) {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("영화정보 입력(i), 수정(u), 삭제(d), 장르로 영화찾기(f), 전체 목록 출력(l), 종료(q)");
			System.out.print("메뉴:");
			String menu = scan.next();
			switch (menu.toLowerCase().charAt(0)) {
			case 'i':
				System.out.println("영화정보 입력하세요.");
				insertMovie();
				break;
			case 'u':
				System.out.println("영화 정보를 수정합니다.");
				updateMovie();
				break;
			case 'd':
				System.out.println("영화 정보를 삭제합니다.");
				deleteMovie();
				break;
			case 'f':
				System.out.println("장르로 영화를 찾습니다");
				findMovie();
				break;
			case 'l':
				System.out.println("전체 목록을 출력합니다");
				printMovieList();
				break;

			case 'q':
				System.out.println("식자재 관리 프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}// end switch
		} // end while

	}

	private static void printMovieList() {
		if(movieList.isEmpty()) {
			System.out.println("출력할 내용이 없습니다.");
		}else {
			for (int i = 0; i < movieList.size(); i++) {
				System.out.println(movieList.get(i));
			}
		}

	}

	private static void findMovie() {
		System.out.println("영화 이름을 입력하세요 : ");
		String findMovieName = scan.next();
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(findMovieName)) {
				System.out.println(movieList.get(i));
			} else {
				System.out.println("해당 영화가 없습니다.");
			}
		}

	}

	private static void deleteMovie() {
		String findMovieName = scan.next();
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(findMovieName)) {
				movieList.remove(i);
				break;
			} else {
				System.out.println("찾는 영화가 없습니다.");
				break;
			}
		}

	}

	private static void updateMovie() {
		// 제목말고 다른거 다 수정하기
		System.out.println("수정할 영화 이름을 입력하세요 : ");
		String findMovieName = scan.next();
		for (int i = 0; i < movieList.size(); i++) {
			if (movieList.get(i).getName().equals(findMovieName)) {
				Movie movie = movieList.get(i);
				// 찾는 영화가 있을 경우
				System.out.print("장르 : ");
				String findGenre = scan.next();
				System.out.print("감독 : ");
				String findDirect = scan.next();
				System.out.print("주연 : ");
				String findActor = scan.next();
				System.out.print("개봉일 : ");
				String findOpening = scan.next();

				movie.setGenre(findGenre);
				movie.setDirector(findDirect);
				movie.setMainActor(findActor);
				movie.setOpenDate(findOpening);
				break;
			} else {
				// 찾는 영화 없을 경우
				System.out.println("해당 영화가 없습니다.");
				break;
			}
		}

	} // end update

	private static void insertMovie() {
		System.out.print("제목 : ");
		String movieSubject = scan.next();
		System.out.print("장르 : ");
		String genre = scan.next();
		System.out.print("감독 : ");
		String direct = scan.next();
		System.out.print("주연 : ");
		String actor = scan.next();
		System.out.print("개봉일 : ");
		String opening = scan.next();

		movieList.add(new Movie(movieSubject, genre, direct, actor, opening));

	} // end insert

}
