# boot-source-maps-issue

1. Clone this project
2. Run `boot build-cljs`
3. Open target/public/index.html in a browser.

Expected: debugger opens and shows ClojureScript code and local variable x with value 10.
Got: debugger opens, but I don't see the code and don't see the local variable x.
