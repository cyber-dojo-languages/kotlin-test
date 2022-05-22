
lambda { |stdout,stderr,status|
  output = stdout + stderr
  return :red   if /^Tests: passed 0, failed 0, ignored 0/.match(output)
  return :red   if /^Tests: passed (\d+), failed [1-9][0-9]*, ignored (\d+)/.match(output)
  return :green if /^Tests: passed (\d+), failed 0, ignored (\d+)/.match(output)
  return :amber
}
