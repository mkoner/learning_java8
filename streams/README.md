## JAVA 8 - Streams
<hr>
<div>
A sequence of elements supporting sequential and parallel aggregate operations.
</div> 

#### Generating Streams
With Java 8, Collection interface has two methods to generate a Stream. <br>
stream() − Returns a sequential stream considering collection as its source. <br>
parallelStream() − Returns a parallel Stream considering collection as its source. <br>
<br>
<div>

#### Some methods

##### forEach
`void forEach(Consumer<? super T> action)` <br>
Performs an action for each element of this stream.
This is a terminal operation. 


##### map
`<R> Stream<R> map(Function<? super T,? extends R> mapper)` <br>
Returns a stream consisting of the results of applying the given function to the elements of this stream.
This is an intermediate operation. <br>
Example: <br>
`List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//get list of unique squares
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());`

##### filter
`Stream<T> filter(Predicate<? super T> predicate)` <br>
Returns a stream consisting of the elements of this stream that match the given predicate.
This is an intermediate operation. <br>
Example: <br>
`List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

//get count of empty string
int count = strings.stream().filter(string -> string.isEmpty()).count();`

##### limit
`limit(long maxSize)`
Returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length.
This is a short-circuiting stateful intermediate operation.
Example: <br>
`Random random = new Random();
random.ints().limit(10).forEach(System.out::println);`

##### sorted
`Stream<T> sorted()`
Returns a stream consisting of the elements of this stream, sorted according to natural order. If the elements of this stream are not Comparable, a java.lang.ClassCastException may be thrown when the terminal operation is executed.
This is a stateful intermediate operation.
Example: <br>
`Random random = new Random();
random.ints().limit(10).sorted.forEach(System.out::println);`

##### reduce
`T reduce(T identity, BinaryOperator<T> accumulator)`
Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value. <br>
Where, identity is initial value of type T and accumulator is a function for combining two values. <br>
This is equivalent to:
`T result = identity;
     for (T element : this stream)
         result = accumulator.apply(result, element)
     return result;`
This is a terminal operation.

##### toArray
`Object[] toArray()`
Returns an array containing the elements of this stream.
This is a terminal operation.

##### distinct 
`Stream<T> distinct()`
Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream.
This is a stateful intermediate operation.

##### allMatch
`boolean allMatch(Predicate<? super T> predicate)`
Returns whether all elements of this stream match the provided predicate. May not evaluate the predicate on all elements if not necessary for determining the result. If the stream is empty then true is returned and the predicate is not evaluated.
This is a short-circuiting terminal operation.

##### anyMatch
`boolean anyMatch(Predicate<? super T> predicate)`
Returns whether any elements of this stream match the provided predicate. May not evaluate the predicate on all elements if not necessary for determining the result. If the stream is empty then false is returned and the predicate is not evaluated.
This is a short-circuiting terminal operation.

##### noneMatch
`boolean noneMatch(Predicate<? super T> predicate)`
Returns whether no elements of this stream match the provided predicate. May not evaluate the predicate on all elements if not necessary for determining the result. If the stream is empty then true is returned and the predicate is not evaluated.
This is a short-circuiting terminal operation.

##### findFirst
`Optional<T> findFirst()`
Returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty. If the stream has no encounter order, then any element may be returned.
This is a short-circuiting terminal operation.

##### findAny
`Optional<T> findAny()`

##### concat
`static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)`
Creates a lazily concatenated stream whose elements are all the elements of the first stream followed by all the elements of the second stream. The resulting stream is ordered if both of the input streams are ordered, and parallel if either of the input streams is parallel

##### collect
`<R,A> R collect(Collector<? super T,A,R> collector)`

`Map<String, List<Person>> peopleByCity
         = personStream.collect(Collectors.groupingBy(Person::getCity));`

Performs a mutable reduction operation on the elements of this stream using a Collector. A Collector encapsulates the functions used as arguments to collect(Supplier, BiConsumer, BiConsumer), allowing for reuse of collection strategies and composition of collect operations such as multiple-level grouping or partitioning.
This is a terminal operation.
</div>



<br>
<br>
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html <br>
https://www.tutorialspoint.com/java8/java8_streams.htm