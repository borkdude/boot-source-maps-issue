(set-env!
 :resource-paths #{"resources"}
 :source-paths #{"src-cljs"}
 :dependencies '[[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.229"]
                 [adzerk/boot-cljs "1.7.228-1" :scope "test"]])

(require '[adzerk.boot-cljs :refer :all])

(deftask build-cljs []
  (set-env!
   :source-paths #(conj % "src-cljs-dev"))
  (comp
   (cljs
    :source-map true
    :compiler-options {:parallel-build true})
   (target)))
