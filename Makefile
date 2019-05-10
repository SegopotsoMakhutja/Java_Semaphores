# Java MAKEFILE
# Segopotso Makhutja

JAVAC=javac

.SUFFIXES: .java .class

SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	 $(JAVAC) -d $(BINDIR)/-cp $(BINDIR) $<

.java.class:
	$(JAVAC) $<

classes:	BThread.class\
			Barrier.class\
			BarrierTest.class

class_files=$(classes:%.class=$(BINDIR)/%.class)

default: $(CLASSES)

def:
	java BarrierTest 5 5

run:
	java BarrierTest $(ARGS)

clean:
	rm *.class
