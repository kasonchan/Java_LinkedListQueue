QueueDemo:
	javac -Xlint QueueDemo.java

clean:
	rm -f Queue\*.class
	rm -f *.class

run:
	java QueueDemo