package main

import (
	"fmt"
	"time"
)

func funcA() {
	fmt.Println("In func A")
}

func funcB() {
	fmt.Println("In func B")
}

func funcC() {
	fmt.Println("In func C")
}

func funcD() {
	fmt.Println("In func D")
	var counter = 0
	for {
		funcE(counter)
		counter++
	}
}

func funcE(counter int) {
	fmt.Println("In func E", counter)
	time.Sleep(4 * time.Second)
}

func main() {
	funcA()
	funcB()
	funcC()
	funcD()
}
