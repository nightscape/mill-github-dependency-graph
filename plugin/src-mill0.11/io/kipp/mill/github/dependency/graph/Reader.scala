package io.kipp.mill.github.dependency.graph

private[graph] object Reader {
  implicit def millEvaluatorTokenReader =
    mill.main.TokenReaders.millEvaluatorTokenReader
}
