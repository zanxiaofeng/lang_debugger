#include <stdio.h>

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
