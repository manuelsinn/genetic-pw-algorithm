# genetic-pw-algorithm

Using evolution to crack passwords

## How it works
Evolutionary algorithm that uses simulation of natural selection and mutation, to quickly find the right password via a fitness function.
It uses Truncation Selection, Gaussian Mutation and either k-Point or Uniform Crossover as the procreation mechanism. 
To get a measure of how efficient the different variants are, the amount of generations needed to crack the password is compared to the bruteforce complexity.

To learn more, visit [the blog](https://manuelsinn.netlify.com/posts/evolution-pw/).
