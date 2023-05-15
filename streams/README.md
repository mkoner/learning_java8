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
`void forEach(Consumer<? super T> action)`
Performs an action for each element of this stream.
This is a terminal operation.
</div>



<br>
<br>
https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html <br>
https://www.tutorialspoint.com/java8/java8_streams.htm