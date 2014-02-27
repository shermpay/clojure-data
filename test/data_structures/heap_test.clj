(ns data.heap-test
  (:require [clojure.test :refer :all]
            [data.heap :refer :all]))

(deftest const-test
  (testing "Simple case"
    (is (= '() (heap)))
    (is (= '(1 2) (heap 1 2)))
    (is (= '(3 4 5) (heap 3 4 5))))
  (testing "Complex case"
    (is (= '(1 3 4 6 5) (heap 6 5 4 3 1)))
    (is (= '(3 8 17 29 12) (heap 29 8 17 3 12)))
    (is (= '(1 2 2 3 2) (heap 1 2 2 3 2)))))

(deftest insert-test
  (testing "Simple case"
    (is (= '(1) (insert (heap) 1)))
    (is (= '(1 2) (insert (heap 1) 2))))
  (testing "Complex case"
    (is (= '(1 3 2) (insert (heap 3 2) 1)))
    (is (= '(1 3 2 7 6) (insert (heap 1 3 7 6) 2)))))
