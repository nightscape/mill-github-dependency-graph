package io.kipp.mill.github.dependency.graph

import mill.main.EvaluatorScopt

private[graph] object Reader {
  implicit def millScoptEvaluatorReads[A]: EvaluatorScopt[A] =
    new EvaluatorScopt[A]()
}
