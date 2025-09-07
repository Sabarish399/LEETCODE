// Problem: 2667. Create Hello World Function
// Link: https://leetcode.com/problems/create-hello-world-function/
// Approach: Return a function that takes any number of arguments and always returns the string "Hello World".
// Time Complexity: O(1)
// Space Complexity: O(1)

var createHelloWorld = function() {
    return function(...args) {
        return "Hello World";
    };
};
