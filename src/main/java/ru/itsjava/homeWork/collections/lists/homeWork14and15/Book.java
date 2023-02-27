package ru.itsjava.homeWork.collections.lists.homeWork14and15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book {
    private final String name;
    private final String author;
    private final int numberOfPages;

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Book)) return false;
        final Book other = (Book) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) return false;
        if (this.getNumberOfPages() != other.getNumberOfPages()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Book;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        result = result * PRIME + this.getNumberOfPages();
        return result;
    }

    public String toString() {
        return "Book{\"" + this.getName() + "\", \"" + this.getAuthor() + "\", " + this.getNumberOfPages() + "}";
    }
}
