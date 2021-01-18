#include <stdio.h>
#include <unistd.h>

void funcA() {
	printf("in funcA");
}

void funcB() {
	printf("in funcB");
}

void funcC() {
	printf("in funcC");
}

void funcE() {
	printf("in funcE");
	//sleep 10 seconds
	sleep(10);
}

void funcD() {
	printf("in funcD");
	while (1){
		funcE();
	}
}

int main(int argc, char* argv[]) {
	funcA();
	funcB();
	funcC();
	funcD();
}
