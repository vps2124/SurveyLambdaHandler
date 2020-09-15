package vipul.readLamda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaReadHandler implements RequestHandler<Object, Object> {
	private String DYNAMODB_TABLE_NAME = "Survey";

	@Override
	public Object handleRequest(Object input, Context context) {

		return null;
	}
}
