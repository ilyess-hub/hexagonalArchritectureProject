package org.example.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.example.data.BookDto;
import org.example.data.BookDto.BookDtoBuilder;
import org.example.entity.Book;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-16T16:07:20+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto bookToBookDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDtoBuilder bookDto = BookDto.builder();

        return bookDto.build();
    }

    @Override
    public Book bookDtoToBook(BookDto bookDto) {
        if ( bookDto == null ) {
            return null;
        }

        Book book = new Book();

        return book;
    }

    @Override
    public List<BookDto> bookListToBookDtoList(List<Book> bookList) {
        if ( bookList == null ) {
            return null;
        }

        List<BookDto> list = new ArrayList<BookDto>( bookList.size() );
        for ( Book book : bookList ) {
            list.add( bookToBookDto( book ) );
        }

        return list;
    }

    @Override
    public List<Book> BookDtoListTobookList(List<BookDto> BookDtoList) {
        if ( BookDtoList == null ) {
            return null;
        }

        List<Book> list = new ArrayList<Book>( BookDtoList.size() );
        for ( BookDto bookDto : BookDtoList ) {
            list.add( bookDtoToBook( bookDto ) );
        }

        return list;
    }
}
