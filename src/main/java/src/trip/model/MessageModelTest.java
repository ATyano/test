package src.trip.model;

import org.springframework.stereotype.Service;

@Service
//@Profile("test")
public class MessageModelTest implements MessageInterface {
	@Override
	public void message() {
		System.out.println("テストプログラム実行");
		
		
		
	}
}
