/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AMainClass extends PMainClass
{
    private TClas _clas_;
    private TId _cname_;
    private TLbrace _ol_;
    private TPublic _public_;
    private TStatic _static_;
    private TVoid _void_;
    private TMain _main_;
    private TLparen _lparen_;
    private TString _string_;
    private PArray _array_;
    private TId _arg_;
    private TRparen _rparen_;
    private TLbrace _lbrace_;
    private PStmt _body_;
    private TRbrace _rbrace_;
    private TRbrace _or_;

    public AMainClass()
    {
        // Constructor
    }

    public AMainClass(
        @SuppressWarnings("hiding") TClas _clas_,
        @SuppressWarnings("hiding") TId _cname_,
        @SuppressWarnings("hiding") TLbrace _ol_,
        @SuppressWarnings("hiding") TPublic _public_,
        @SuppressWarnings("hiding") TStatic _static_,
        @SuppressWarnings("hiding") TVoid _void_,
        @SuppressWarnings("hiding") TMain _main_,
        @SuppressWarnings("hiding") TLparen _lparen_,
        @SuppressWarnings("hiding") TString _string_,
        @SuppressWarnings("hiding") PArray _array_,
        @SuppressWarnings("hiding") TId _arg_,
        @SuppressWarnings("hiding") TRparen _rparen_,
        @SuppressWarnings("hiding") TLbrace _lbrace_,
        @SuppressWarnings("hiding") PStmt _body_,
        @SuppressWarnings("hiding") TRbrace _rbrace_,
        @SuppressWarnings("hiding") TRbrace _or_)
    {
        // Constructor
        setClas(_clas_);

        setCname(_cname_);

        setOl(_ol_);

        setPublic(_public_);

        setStatic(_static_);

        setVoid(_void_);

        setMain(_main_);

        setLparen(_lparen_);

        setString(_string_);

        setArray(_array_);

        setArg(_arg_);

        setRparen(_rparen_);

        setLbrace(_lbrace_);

        setBody(_body_);

        setRbrace(_rbrace_);

        setOr(_or_);

    }

    @Override
    public Object clone()
    {
        return new AMainClass(
            cloneNode(this._clas_),
            cloneNode(this._cname_),
            cloneNode(this._ol_),
            cloneNode(this._public_),
            cloneNode(this._static_),
            cloneNode(this._void_),
            cloneNode(this._main_),
            cloneNode(this._lparen_),
            cloneNode(this._string_),
            cloneNode(this._array_),
            cloneNode(this._arg_),
            cloneNode(this._rparen_),
            cloneNode(this._lbrace_),
            cloneNode(this._body_),
            cloneNode(this._rbrace_),
            cloneNode(this._or_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMainClass(this);
    }

    public TClas getClas()
    {
        return this._clas_;
    }

    public void setClas(TClas node)
    {
        if(this._clas_ != null)
        {
            this._clas_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._clas_ = node;
    }

    public TId getCname()
    {
        return this._cname_;
    }

    public void setCname(TId node)
    {
        if(this._cname_ != null)
        {
            this._cname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._cname_ = node;
    }

    public TLbrace getOl()
    {
        return this._ol_;
    }

    public void setOl(TLbrace node)
    {
        if(this._ol_ != null)
        {
            this._ol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ol_ = node;
    }

    public TPublic getPublic()
    {
        return this._public_;
    }

    public void setPublic(TPublic node)
    {
        if(this._public_ != null)
        {
            this._public_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._public_ = node;
    }

    public TStatic getStatic()
    {
        return this._static_;
    }

    public void setStatic(TStatic node)
    {
        if(this._static_ != null)
        {
            this._static_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._static_ = node;
    }

    public TVoid getVoid()
    {
        return this._void_;
    }

    public void setVoid(TVoid node)
    {
        if(this._void_ != null)
        {
            this._void_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._void_ = node;
    }

    public TMain getMain()
    {
        return this._main_;
    }

    public void setMain(TMain node)
    {
        if(this._main_ != null)
        {
            this._main_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._main_ = node;
    }

    public TLparen getLparen()
    {
        return this._lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(this._lparen_ != null)
        {
            this._lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparen_ = node;
    }

    public TString getString()
    {
        return this._string_;
    }

    public void setString(TString node)
    {
        if(this._string_ != null)
        {
            this._string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._string_ = node;
    }

    public PArray getArray()
    {
        return this._array_;
    }

    public void setArray(PArray node)
    {
        if(this._array_ != null)
        {
            this._array_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._array_ = node;
    }

    public TId getArg()
    {
        return this._arg_;
    }

    public void setArg(TId node)
    {
        if(this._arg_ != null)
        {
            this._arg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arg_ = node;
    }

    public TRparen getRparen()
    {
        return this._rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(this._rparen_ != null)
        {
            this._rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparen_ = node;
    }

    public TLbrace getLbrace()
    {
        return this._lbrace_;
    }

    public void setLbrace(TLbrace node)
    {
        if(this._lbrace_ != null)
        {
            this._lbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lbrace_ = node;
    }

    public PStmt getBody()
    {
        return this._body_;
    }

    public void setBody(PStmt node)
    {
        if(this._body_ != null)
        {
            this._body_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._body_ = node;
    }

    public TRbrace getRbrace()
    {
        return this._rbrace_;
    }

    public void setRbrace(TRbrace node)
    {
        if(this._rbrace_ != null)
        {
            this._rbrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rbrace_ = node;
    }

    public TRbrace getOr()
    {
        return this._or_;
    }

    public void setOr(TRbrace node)
    {
        if(this._or_ != null)
        {
            this._or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._or_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._clas_)
            + toString(this._cname_)
            + toString(this._ol_)
            + toString(this._public_)
            + toString(this._static_)
            + toString(this._void_)
            + toString(this._main_)
            + toString(this._lparen_)
            + toString(this._string_)
            + toString(this._array_)
            + toString(this._arg_)
            + toString(this._rparen_)
            + toString(this._lbrace_)
            + toString(this._body_)
            + toString(this._rbrace_)
            + toString(this._or_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._clas_ == child)
        {
            this._clas_ = null;
            return;
        }

        if(this._cname_ == child)
        {
            this._cname_ = null;
            return;
        }

        if(this._ol_ == child)
        {
            this._ol_ = null;
            return;
        }

        if(this._public_ == child)
        {
            this._public_ = null;
            return;
        }

        if(this._static_ == child)
        {
            this._static_ = null;
            return;
        }

        if(this._void_ == child)
        {
            this._void_ = null;
            return;
        }

        if(this._main_ == child)
        {
            this._main_ = null;
            return;
        }

        if(this._lparen_ == child)
        {
            this._lparen_ = null;
            return;
        }

        if(this._string_ == child)
        {
            this._string_ = null;
            return;
        }

        if(this._array_ == child)
        {
            this._array_ = null;
            return;
        }

        if(this._arg_ == child)
        {
            this._arg_ = null;
            return;
        }

        if(this._rparen_ == child)
        {
            this._rparen_ = null;
            return;
        }

        if(this._lbrace_ == child)
        {
            this._lbrace_ = null;
            return;
        }

        if(this._body_ == child)
        {
            this._body_ = null;
            return;
        }

        if(this._rbrace_ == child)
        {
            this._rbrace_ = null;
            return;
        }

        if(this._or_ == child)
        {
            this._or_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._clas_ == oldChild)
        {
            setClas((TClas) newChild);
            return;
        }

        if(this._cname_ == oldChild)
        {
            setCname((TId) newChild);
            return;
        }

        if(this._ol_ == oldChild)
        {
            setOl((TLbrace) newChild);
            return;
        }

        if(this._public_ == oldChild)
        {
            setPublic((TPublic) newChild);
            return;
        }

        if(this._static_ == oldChild)
        {
            setStatic((TStatic) newChild);
            return;
        }

        if(this._void_ == oldChild)
        {
            setVoid((TVoid) newChild);
            return;
        }

        if(this._main_ == oldChild)
        {
            setMain((TMain) newChild);
            return;
        }

        if(this._lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(this._string_ == oldChild)
        {
            setString((TString) newChild);
            return;
        }

        if(this._array_ == oldChild)
        {
            setArray((PArray) newChild);
            return;
        }

        if(this._arg_ == oldChild)
        {
            setArg((TId) newChild);
            return;
        }

        if(this._rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(this._lbrace_ == oldChild)
        {
            setLbrace((TLbrace) newChild);
            return;
        }

        if(this._body_ == oldChild)
        {
            setBody((PStmt) newChild);
            return;
        }

        if(this._rbrace_ == oldChild)
        {
            setRbrace((TRbrace) newChild);
            return;
        }

        if(this._or_ == oldChild)
        {
            setOr((TRbrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
