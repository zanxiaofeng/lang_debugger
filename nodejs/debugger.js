# sleep
function sleep(milliSeconds) { 
    var startTime = new Date().getTime(); 
    while (new Date().getTime() < startTime + milliSeconds);
};
sleep(10000);

# output log
console.log("test");

# interrupt
debugger

# run shell
const exec = require('child_process').exec;
var yourscript = exec('env', (error, stdout, stderr) => {
            console.log(stdout);
            console.log(stderr);
});

const exec = require('child_process').exec;
var yourscript = exec('ls -al .', (error, stdout, stderr) => {
            console.log(stdout);
            console.log(stderr);
});

# get stack info

# profile

#read config from external

#format by template

# pid

# cwd
