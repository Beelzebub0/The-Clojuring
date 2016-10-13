(ns sourcecode.core)

(def perg (fn [m c] (fn [x] (+ (m x) c))))

(def garis1 (perg 1 3))

(def coba (fn [x] (* x 4)))

(def sqr (fn
   [x]
   (* x x)))

(defn square [x]
  (* x x))

(defn gradien
  [m]
  (if (> m 0) 
    "naik"
    (if (< m 0) "turun" "lurus")))

(defn grd 
  [m]
  (cond (> m 0)
    "naik"
    (< m 0) "turun"
    :else "tae"))

(defn ngasal1
  [m]
  (let [a (* m 4)]
    (* m a)))

(defn kecap
  [a b c x?]
  (let [disk (Math/sqrt (- (square b) (* 4 a c)))]
    (/ (+ (- b)
          (if (= x? 1) 
            disk 
            (- disk)))
       (* 2 a))))

(defn shit
  [nama]
  (str "Hello, " nama  "!"))

(defn sum
  [n]
  (if (empty? n) 0
    (+ (first n) (sum (rest n)))))

(defn foo [x] (when (> x 0) (conj (foo (dec x)) x)))

(loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result))

(defn count'
  [[x & xs]]
  (if x
    (+ 1 (count' xs)) 0))


(defn sum'
  [[x & xs]]
  (if x
    (+ x (sum' xs)) 0)) 

  

(defn faktorial
  [n]
  (if (<= n 1) 1 
    (* n (faktorial (dec n)))))


(defn prime?
  [x]
  (let [iter (fn iter [i]
               (cond (= x i) true
                 (zero? (rem x i)) false
                 :else (iter (+ i 1))))]
    (cond (<= x 1) false
    (= x 2) true
    :else (iter 2))))

(defn tae
  [xs]
  (first (reverse xs)))

(defn palindrom
  [xs]
  (if (= (apply str (reverse xs)) xs) true false))


(defn max'
  [x & xs]
  (reduce #(if (> %1 %2) %1 %2) x xs))

(defn coba
  [a b c d]
  (let [x 5] (if (> a c) (* x a) (* a b c d))))
