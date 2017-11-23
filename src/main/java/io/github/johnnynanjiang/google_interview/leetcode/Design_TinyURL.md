#### How many unique identifiers possible? Will you run out of unique URLs?

pow(10+26+26, 6)

---

#### Should the identifier be increment or not? Which is easier to design? Pros and cons?

##### i. increment

pros

1. quick to allocate new identifier
2. quick to search

cons

1. the counter would be hard to maintain in concurrent and distributed environment

##### ii. non-increment

pros

1. easy to scale in concurrent and distributed environment

cons

1. slow to allocate new identifier due to duplicate check

---

- Mapping an identifier to an URL and its reversal - Does this problem ring a bell to you?
- How do you store the URLs? Does a simple flat file database work?
- What is the bottleneck of the system? Is it read-heavy or write-heavy?
- Estimate the maximum number of URLs a single machine can store.
- Estimate the maximum number of queries per second (QPS) for decoding a shortened URL in a single machine.
- How would you scale the service? For example, a viral link which is shared in social media could result in a peak QPS at a moment's notice.
- How could you handle redundancy? i,e, if a server is down, how could you ensure the service is still operational?
- Keep URLs forever or prune, pros/cons? How we do pruning? (Contributed by @alex_svetkin)
- What API would you provide to a third-party developer? (Contributed by @alex_svetkin)
- If you can enable caching, what would you cache and what's the expiry time? (Contributed by @Humandroid)