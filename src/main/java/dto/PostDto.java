package dto;

import java.util.Objects;

public class PostDto
{
    private long id;
    
    private String header;
    
    private String text;
    
    public PostDto(long id, String header, String text)
    {
        this.id = id;
        this.header = header;
        this.text = text;
    }
    
    public long getId()
    {
        return id;
    }
    
    public void setId(long id)
    {
        this.id = id;
    }
    
    public String getHeader()
    {
        return header;
    }
    
    public void setHeader(String header)
    {
        this.header = header;
    }
    
    public String getText()
    {
        return text;
    }
    
    public void setText(String text)
    {
        this.text = text;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        PostDto postDto = (PostDto) o;
        
        return this.id == postDto.getId()
                && this.header.equals(postDto.getHeader())
                && this.text.equals(postDto.getText());
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(id, header, text);
    }
}