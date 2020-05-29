/* This file was generated by SableCC (http://www.sablecc.org/). */

package minijava.node;

import minijava.analysis.*;

@SuppressWarnings("nls")
public final class AExtendsDeclClassDecl extends PClassDecl
{
    private PExtendsDecl _extendsDecl_;

    public AExtendsDeclClassDecl()
    {
        // Constructor
    }

    public AExtendsDeclClassDecl(
        @SuppressWarnings("hiding") PExtendsDecl _extendsDecl_)
    {
        // Constructor
        setExtendsDecl(_extendsDecl_);

    }

    @Override
    public Object clone()
    {
        return new AExtendsDeclClassDecl(
            cloneNode(this._extendsDecl_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExtendsDeclClassDecl(this);
    }

    public PExtendsDecl getExtendsDecl()
    {
        return this._extendsDecl_;
    }

    public void setExtendsDecl(PExtendsDecl node)
    {
        if(this._extendsDecl_ != null)
        {
            this._extendsDecl_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._extendsDecl_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._extendsDecl_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._extendsDecl_ == child)
        {
            this._extendsDecl_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._extendsDecl_ == oldChild)
        {
            setExtendsDecl((PExtendsDecl) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}