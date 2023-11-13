package src.trip.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Prod")
public class MessageModel implements MessageInterface {
	@Override
	public void message() {
		System.out.println("本番プログラム実行");

	}
}
