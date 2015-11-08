(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "I'm a little teapot!"))
;;(println "cleanliness is next to godliness")

(defn train
  []
  (println "Choo choo!"))

(defn too-enthusiastic 
  "Return a cheer that might be a bit too enthusiastic"
  [name] 
  (str "Oh. My. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(defn test
  "this is a test"
  []
  (println "test!"))

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))
(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))

(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: " (clojure.string/join ", " things)))

(defn my-first
  [[first-thing]]
  first-thing)

(defn chooser
  [[first-choice second-choice & unimportant-choice]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. " "Here they are in case you need to cry over them: " (clojure.string/join ", " unimportant-choice))))
