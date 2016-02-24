import java8.util.function.BiConsumer;
import java8.util.function.LongFunction;
import java8.util.function.LongUnaryOperator;
import java8.util.function.ObjLongConsumer;
import java8.util.function.Supplier;
import java8.util.stream.Collectors;
import java8.util.stream.LongStreams;

import java.util.*;


public class TestStream2 {

	public static void main(String[] args) {
				
				
		 List<? extends Object> asList = LongStreams.iterate(1, new LongUnaryOperator() {
			
			@Override
			public long applyAsLong(long arg0) {
				// TODO Auto-generated method stub
				return arg0+1;
			}
		})
		.limit(1000)
		
		.mapToObj(new LongFunction<Object>() {

			@Override
			public Object apply(long arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
		})
		
		/*
		.collect(new Supplier<List<Long>>(){
			@Override
			public List<Long> get() {
				return new ArrayList<>();
			}
		}, new ObjLongConsumer<List<Long>>() {

			@Override
			public void accept(List<Long> arg0, long arg1) {
				arg0.add(arg1);
			}
		}, new BiConsumer<List<Long>, List<Long>>() {
			@Override
			public void accept(List<Long> arg0, List<Long> arg1) {
				arg0.addAll(arg1);
			}
		});
		*/
		.collect(Collectors.toList());
		 System.out.println(asList);
		
	}

}
