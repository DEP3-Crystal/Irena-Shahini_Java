package com.crystal.examples;

public class ex2 {

    public class Cache {}

    public class DiskCache extends Cache {}

    public class MemoryCache extends Cache {}

    public class OptimizedDiskCache extends DiskCache {}
//    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();  FALSE
//    Cache cache = (Cache) optimizedDiskCache;
//
//
//    MemoryCache memoryCache = new MemoryCache();     TRUE
//    Cache cache = (Cache) memoryCache;
//    DiskCache diskCache = (DiskCache) cache;
//
//
//    DiskCache diskCache = new DiskCache();
//    OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;  TRUE
//
//
//    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();   FALSE
//    DiskCache diskCache = (DiskCache) optimizedDiskCache;
//
//
//    Cache cache = new Cache();
//    MemoryCache memoryCache = (MemoryCache) cache;              TRUE
//
//
//    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();     FALSE
//    Cache cache = (Cache) optimizedDiskCache;
//    DiskCache diskCache = (DiskCache) cache;

}
